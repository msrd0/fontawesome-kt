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

object FA_BOWL_RICE: Icon {
	
	override val name get() = "Bowl Rice"
	
	override val unicode get() = "e2eb"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M208 72C208 58.75 218.7 48 232 48H248C261.3 48 272 58.75 272 72C272 85.25 261.3 96 248 96H232C218.7 96 208 85.25 208 72zM208 152C208 138.7 218.7 128 232 128H248C261.3 128 272 138.7 272 152C272 165.3 261.3 176 248 176H232C218.7 176 208 165.3 208 152zM16 232C16 218.7 26.75 208 40 208H56C69.25 208 80 218.7 80 232C80 245.3 69.25 256 56 256H40C26.75 256 16 245.3 16 232zM532.6 288C547.7 288 560 300.3 560 315.4C560 388.3 512.6 450.2 446.9 471.8C447.6 474.4 448 477.2 448 480C448 497.7 433.7 512 416 512H160C142.3 512 128 497.7 128 480C128 477.2 128.4 474.4 129.1 471.8C63.4 450.2 16 388.3 16 315.4C16 300.3 28.28 288 43.43 288H532.6zM248 208C261.3 208 272 218.7 272 232C272 245.3 261.3 256 248 256H232C218.7 256 208 245.3 208 232C208 218.7 218.7 208 232 208H248zM152 208C165.3 208 176 218.7 176 232C176 245.3 165.3 256 152 256H136C122.7 256 112 245.3 112 232C112 218.7 122.7 208 136 208H152zM112 152C112 138.7 122.7 128 136 128H152C165.3 128 176 138.7 176 152C176 165.3 165.3 176 152 176H136C122.7 176 112 165.3 112 152zM344 208C357.3 208 368 218.7 368 232C368 245.3 357.3 256 344 256H328C314.7 256 304 245.3 304 232C304 218.7 314.7 208 328 208H344zM304 152C304 138.7 314.7 128 328 128H344C357.3 128 368 138.7 368 152C368 165.3 357.3 176 344 176H328C314.7 176 304 165.3 304 152zM440 208C453.3 208 464 218.7 464 232C464 245.3 453.3 256 440 256H424C410.7 256 400 245.3 400 232C400 218.7 410.7 208 424 208H440zM400 152C400 138.7 410.7 128 424 128H440C453.3 128 464 138.7 464 152C464 165.3 453.3 176 440 176H424C410.7 176 400 165.3 400 152zM536 208C549.3 208 560 218.7 560 232C560 245.3 549.3 256 536 256H520C506.7 256 496 245.3 496 232C496 218.7 506.7 208 520 208H536zM344 48C357.3 48 368 58.75 368 72C368 85.25 357.3 96 344 96H328C314.7 96 304 85.25 304 72C304 58.75 314.7 48 328 48H344z"/></svg>"""
		else -> null
	}
	
}
