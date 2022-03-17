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

/** N */
object FA_N: Icon {
	
	override val name get() = "N"
	
	override val unicode get() = "4e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M384 64.01v384c0 13.47-8.438 25.5-21.09 30.09C359.3 479.4 355.7 480 352 480c-9.312 0-18.38-4.078-24.59-11.52L64 152.4v295.6c0 17.67-14.31 32-32 32s-32-14.33-32-32v-384c0-13.47 8.438-25.5 21.09-30.09c12.62-4.516 26.84-.75 35.5 9.609L320 359.6v-295.6c0-17.67 14.31-32 32-32S384 46.34 384 64.01z"/></svg>"""
		else -> null
	}
	
}
