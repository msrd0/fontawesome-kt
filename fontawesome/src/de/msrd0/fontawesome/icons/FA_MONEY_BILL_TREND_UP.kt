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

object FA_MONEY_BILL_TREND_UP: Icon {
	
	override val name get() = "Money Bill-trend-up"
	
	override val unicode get() = "e529"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M470.7 9.441C473.7 12.49 476 16 477.6 19.75C479.1 23.5 479.1 27.6 480 31.9V32V128C480 145.7 465.7 160 448 160C430.3 160 416 145.7 416 128V109.3L310.6 214.6C298.8 226.5 279.9 227.2 267.2 216.3L175.1 138.1L84.82 216.3C71.41 227.8 51.2 226.2 39.7 212.8C28.2 199.4 29.76 179.2 43.17 167.7L155.2 71.7C167.2 61.43 184.8 61.43 196.8 71.7L286.3 148.4L370.7 64H352C334.3 64 320 49.67 320 32C320 14.33 334.3 0 352 0H447.1C456.8 0 464.8 3.554 470.6 9.305L470.7 9.441zM0 304C0 277.5 21.49 256 48 256H464C490.5 256 512 277.5 512 304V464C512 490.5 490.5 512 464 512H48C21.49 512 0 490.5 0 464V304zM48 464H96C96 437.5 74.51 416 48 416V464zM48 304V352C74.51 352 96 330.5 96 304H48zM464 416C437.5 416 416 437.5 416 464H464V416zM416 304C416 330.5 437.5 352 464 352V304H416zM256 320C220.7 320 192 348.7 192 384C192 419.3 220.7 448 256 448C291.3 448 320 419.3 320 384C320 348.7 291.3 320 256 320z"/></svg>"""
		else -> null
	}
	
}
