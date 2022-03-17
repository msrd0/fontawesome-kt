/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_KHANDA: Icon {
	
	override val name get() = "Khanda"
	
	override val unicode get() = "f66d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M447.7 65.1c-6.25-3.5-14.29-2.351-19.29 3.024c-5.125 5.375-5.833 13.37-1.958 19.5c16.5 26.25 25.23 56.34 25.23 87.46c-.25 53.25-26.74 102.6-71.24 132.4l-76.62 53.35v-20.12l44.01-36.12c3.875-4.125 4.983-10.13 2.858-15.26L342.8 273c33.88-19.25 56.94-55.25 56.94-97c0-40.75-22.06-76.12-54.56-95.75l5.151-11.39c2.375-5.5 .9825-11.87-3.518-15.1L287.9 .0074l-59.05 52.77C224.4 57.02 222.1 63.37 225.2 68.87l5.203 11.32C197.1 99.81 175.9 135.2 175.9 175.1c0 41.75 23.08 77.75 56.95 97L224.1 290.2C222.9 295.4 223.9 301.2 227.9 305.5l43.1 36.11v19.91L195.2 308.1c-44.25-29.5-70.72-78.9-70.97-132.1c0-31.12 8.73-61.2 25.23-87.45C153.3 82.4 151.8 74.75 146.8 69.5C141.8 64.12 133.2 63.25 126.8 66.75C48.34 109.6 9.713 205.2 45.34 296c7 18 17.88 34.38 30.5 49l55.92 65.38c4.875 5.75 13.09 7.232 19.71 3.732l79.25-42.25l29.26 20.37l-47.09 32.75c-1.625-.375-3.125-1-4.1-1c-13.25 0-23.97 10.75-23.97 24s10.72 23.1 23.97 23.1c12.13 0 21.74-9.126 23.36-20.75l40.6-28.25v29.91c-9.375 5.625-15.97 15.37-15.97 27.12c0 17.62 14.37 31.1 31.1 31.1c17.63 0 31.1-14.37 31.1-31.1c0-11.75-6.656-21.52-16.03-27.14v-30.12l40.87 28.48c1.625 11.63 11.23 20.75 23.35 20.75c13.25 0 23.98-10.74 23.98-23.99s-10.73-24-23.98-24c-1.875 0-3.375 .625-5 1l-47.09-32.75l29.25-20.37l79.26 42.25c6.625 3.5 14.84 2.018 19.71-3.732l52.51-61.27c18.88-22 33.1-47.49 41.25-75.61C559.6 189.9 521.5 106.2 447.7 65.1zM351.8 176c0 22.25-11.45 41.91-28.82 53.41l-5.613-12.43c-8.75-24.5-8.811-51.11-.061-75.61l7.748-17.12C341.2 135.9 351.8 154.6 351.8 176zM223.8 176c0-21.38 10.67-40.16 26.67-51.79l7.848 17.17c8.75 24.63 8.747 51.11-.0032 75.61L252.7 229.4C235.4 217.9 223.8 198.2 223.8 176z"/></svg>"""
		else -> null
	}
	
}
