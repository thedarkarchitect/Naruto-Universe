package com.example.narutouniverse.data.remote
//
//import androidx.paging.PagingSource
//import androidx.paging.PagingState
//
//class NarutoPaging(
//    private val narutoApi: NarutoApi
//): PagingSource<Int, Characters>() {
//
//    private var totalCount = 0
//    override fun getRefreshKey(state: PagingState<Int, Characters>): Int? {
//        return state.anchorPosition?.let { anchorPosition ->
//            val anchorPage = state.closestPageToPosition(anchorPosition)
//            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
//        }
//    }
//
//    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Characters> {
//        val page = params.key ?: 1
//        return try {
//            val characterResponse = narutoApi.getCharacters(page = page, limit = 20)
////            page = characterResponse.currentPage//this will follow the current page param from json in API
//            totalCount += characterResponse.characters.size//adds batches of characters by 20 on each page
//            LoadResult.Page(
//                data = characterResponse.characters,
//                nextKey = if(totalCount == characterResponse.total) null else page + 1,
//                prevKey = null
//            )
//        } catch (e: Exception) {
//            e.printStackTrace()
//            LoadResult.Error(
//                throwable = e
//            )
//        }
//    }
//
//}