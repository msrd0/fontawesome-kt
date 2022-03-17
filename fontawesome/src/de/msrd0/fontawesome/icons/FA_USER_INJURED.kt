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

object FA_USER_INJURED: Icon {
	
	override val name get() = "User Injured"
	
	override val unicode get() = "f728"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M277.4 11.98C261.1 4.469 243.1 0 224 0C170.3 0 124.5 33.13 105.5 80h81.07L277.4 11.98zM342.5 80c-7.895-19.47-20.66-36.19-36.48-49.51L240 80H342.5zM224 256c70.7 0 128-57.31 128-128c0-5.48-.9453-10.7-1.613-16H97.61C96.95 117.3 96 122.5 96 128C96 198.7 153.3 256 224 256zM272 416h-45.14l58.64 93.83C305.4 503.1 320 485.8 320 464C320 437.5 298.5 416 272 416zM274.7 304H173.3c-5.393 0-10.71 .3242-15.98 .8047L206.9 384H272c44.13 0 80 35.88 80 80c0 18.08-6.252 34.59-16.4 48h77.73C432.5 512 448 496.5 448 477.3C448 381.6 370.4 304 274.7 304zM0 477.3C0 496.5 15.52 512 34.66 512H64v-169.1C24.97 374.7 0 423.1 0 477.3zM96 322.4V512h153.1L123.7 311.3C114.1 314.2 104.8 317.9 96 322.4z"/></svg>"""
		else -> null
	}
	
}
