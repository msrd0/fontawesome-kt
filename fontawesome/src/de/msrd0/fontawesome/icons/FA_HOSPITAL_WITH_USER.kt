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

object FA_HOSPITAL_WITH_USER: Icon {
	
	override val name get() = "Hospital with User"
	
	override val unicode get() = "f80d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M480 320a96 96 0 1 0-96-96 96 96 0 0 0 96 96zm48 32a22.88 22.88 0 0 0-7.06 1.09 124.76 124.76 0 0 1-81.89 0A22.82 22.82 0 0 0 432 352a112 112 0 0 0-112 112.62c.14 26.26 21.73 47.38 48 47.38h224c26.27 0 47.86-21.12 48-47.38A112 112 0 0 0 528 352zm-198.09 10.45A145.19 145.19 0 0 1 352 344.62V128a32 32 0 0 0-32-32h-32V32a32 32 0 0 0-32-32H96a32 32 0 0 0-32 32v64H32a32 32 0 0 0-32 32v368a16 16 0 0 0 16 16h288.31A78.62 78.62 0 0 1 288 464.79a143.06 143.06 0 0 1 41.91-102.34zM144 404a12 12 0 0 1-12 12H92a12 12 0 0 1-12-12v-40a12 12 0 0 1 12-12h40a12 12 0 0 1 12 12zm0-128a12 12 0 0 1-12 12H92a12 12 0 0 1-12-12v-40a12 12 0 0 1 12-12h40a12 12 0 0 1 12 12zm48-122a6 6 0 0 1-6 6h-20a6 6 0 0 1-6-6v-26h-26a6 6 0 0 1-6-6v-20a6 6 0 0 1 6-6h26V70a6 6 0 0 1 6-6h20a6 6 0 0 1 6 6v26h26a6 6 0 0 1 6 6v20a6 6 0 0 1-6 6h-26zm80 250a12 12 0 0 1-12 12h-40a12 12 0 0 1-12-12v-40a12 12 0 0 1 12-12h40a12 12 0 0 1 12 12zm0-128a12 12 0 0 1-12 12h-40a12 12 0 0 1-12-12v-40a12 12 0 0 1 12-12h40a12 12 0 0 1 12 12z"/></svg>"""
		else -> null
	}
	
}
